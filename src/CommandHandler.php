<?php

require_once 'TelegramBot.php';

class CommandHandler {
    private $bot;

    public function __construct($bot) {
        $this->bot = $bot;
    }

    public function handleCommand($chatId, $message) {
        // Verifica se a mensagem é um comando
        if (substr($message, 0, 1) === '/') {
            $command = substr($message, 1);

            switch ($command) {
                case 'start':
                    $this->startCommand($chatId);
                    break;
                case 'help':
                    $this->helpCommand($chatId);
                    break;
                default:
                    $this->unknownCommand($chatId);
                    break;
            }
        }
    }

    private function startCommand($chatId) {
        $this->bot->sendMessage($chatId, "Welcome to the Telegram bot!");
    }

    private function helpCommand($chatId) {
        $this->bot->sendMessage($chatId, "Use /start to begin and /help for assistance.");
    }

    private function unknownCommand($chatId) {
        $this->bot->sendMessage($chatId, "Unknown command. Type /help for available commands.");
    }
}
