<?php

class Tasks {
    private $tasks = [];

    public function addTask($task) {
        $this->tasks[] = $task;
    }

    public function listTasks() {
        return $this->tasks;
    }
}
