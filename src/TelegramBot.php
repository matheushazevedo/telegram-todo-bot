<?php

require_once 'Logger.php';

class TelegramBot {
    private $token;
    private $apiUrl;

    public function __construct($token) {
        $this->token = $token;
        $this->apiUrl = "https://api.telegram.org/bot" . $this->token . "/";
    }

    public function sendMessage($chatId, $message) {
        $url = $this->apiUrl . "sendMessage?chat_id=$chatId&text=" . urlencode($message);
        $this->makeRequest($url);
    }

    private function makeRequest($url) {
        $response = file_get_contents($url);
        Logger::log("API Response: " . $response);
    }
}
