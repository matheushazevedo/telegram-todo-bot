<?php

require_once 'TelegramBot.php';

class MessageHandler {
    private $bot;

    public function __construct($bot) {
        $this->bot = $bot;
    }

    public function handleMessage($chatId, $message) {
        
        if (strpos($message, 'hello') !== false) {
            $this->bot->sendMessage($chatId, "Hello! How can I assist you?");
        } else {
            $this->bot->sendMessage($chatId, "I didn't understand that. Type /help for assistance.");
        }
    }
}
