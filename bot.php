<?php

require_once 'src/Logger.php';
require_once 'src/TelegramBot.php';
require_once 'src/CommandHandler.php';
require_once 'src/MessageHandler.php';
require_once 'src/Tasks.php';
require_once 'src/Database.php';
require_once 'src/get_chat_ids.php';

$token = "7512883326:AAFvqXwrryrVY7GiUkxo8I6952EoZY7Tnok";

$apiUrl = "https://api.telegram.org/bot" . $token;

$logFile = 'bot_log.txt';

function logToFileAndTerminal($message) {
    global $logFile;

    $date = date('Y-m-d H:i:s');
    $logMessage = "[" . $date . "] " . $message;


    echo $logMessage . "\n";


    file_put_contents($logFile, $logMessage . "\n", FILE_APPEND);
}


function sendMessage($chatId, $message) {
    global $apiUrl;
    

    $url = $apiUrl . "/sendMessage?chat_id=" . $chatId . "&text=" . urlencode($message);
    file_get_contents($url);

 
    logToFileAndTerminal("Message sent to chat_id: $chatId. Content: $message");
}


include 'get_chat_ids.php';

$update = file_get_contents("php://input");
$update = json_decode($update, TRUE);

logToFileAndTerminal("Received update: " . json_encode($update));

if (isset($update['message']['chat']['id'])) {
    $chatId = $update['message']['chat']['id'];
    
    logToFileAndTerminal("New message received. chat_id: $chatId. Content: " . $update['message']['text']);

    logChatId($chatId);

    $message = "Hello, you are registered to receive messages.";
    sendMessage($chatId, $message);
} else {
    logToFileAndTerminal("Message without chat_id. Data: " . json_encode($update));
}

$chatIds = getChatIds();

foreach ($chatIds as $chatId) {
    sendMessage($chatId, "Message to all registered users.");
    logToFileAndTerminal("Message sent to chat_id: $chatId.");
}

?>
