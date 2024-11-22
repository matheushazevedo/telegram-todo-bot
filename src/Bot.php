<?php

namespace Mathe\TelegramTodoBot;

use Telegram\Bot\Api;

class Bot
{
    private $telegram;

    public function __construct($apiKey)
    {
        $this->telegram = new Api($apiKey);
    }

    public function sendMessage($chatId, $message)
    {
        $this->telegram->sendMessage([
            'chat_id' => $chatId,
            'text' => $message
        ]);
    }

    public function getUpdates()
    {
        return $this->telegram->getUpdates();
    }
}
