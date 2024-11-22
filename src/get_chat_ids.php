<?php

// Função para obter os últimos chat_ids de um arquivo de log
function getChatIds() {
    // Caminho para o arquivo de log onde os chat_ids são armazenados
    $logFile = 'chat_ids_log.txt';

    // Verificar se o arquivo existe
    if (!file_exists($logFile)) {
        return [];  // Retorna um array vazio se o arquivo não existir
    }

    // Ler o conteúdo do arquivo
    $logContents = file_get_contents($logFile);

    // Quebrar o conteúdo em linhas (onde cada linha é um chat_id)
    $chatIds = explode("\n", $logContents);

    // Remover qualquer linha vazia
    $chatIds = array_filter($chatIds, function($id) {
        return !empty(trim($id));
    });

    // Reindexar o array para garantir que as chaves estão corretas
    $chatIds = array_values($chatIds);

    return $chatIds;
}

// Função para registrar um novo chat_id no log (caso queira adicionar dinamicamente)
function logChatId($chatId) {
    $logFile = 'chat_ids_log.txt';
    
    // Adiciona o chat_id ao final do arquivo (com uma nova linha)
    file_put_contents($logFile, $chatId . "\n", FILE_APPEND);
}

?>
