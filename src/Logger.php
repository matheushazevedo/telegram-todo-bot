<?php

class Logger {
    public static function log($message) {
        $timestamp = date('Y-m-d H:i:s');
        file_put_contents('logs.txt', "[$timestamp] $message\n", FILE_APPEND);
    }
}
