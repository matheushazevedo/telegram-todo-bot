<?php

class Database {
    private $db;

    public function __construct() {
        $this->db = new PDO('sqlite:bot.db'); 
    }

    public function createTable() {
        $query = 'CREATE TABLE IF NOT EXISTS tasks (id INTEGER PRIMARY KEY, task TEXT)';
        $this->db->exec($query);
    }

    public function addTask($task) {
        $query = 'INSERT INTO tasks (task) VALUES (:task)';
        $stmt = $this->db->prepare($query);
        $stmt->bindParam(':task', $task);
        $stmt->execute();
    }

    public function getTasks() {
        $query = 'SELECT * FROM tasks';
        $stmt = $this->db->query($query);
        return $stmt->fetchAll(PDO::FETCH_ASSOC);
    }
}
