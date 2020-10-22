package com.nokchax.observer.leetcode.endpoint;

import com.nokchax.observer.leetcode.config.Bot;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.ParseMode;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import javax.annotation.PostConstruct;

@Slf4j
@Component
@RequiredArgsConstructor
public class BotEndPoint extends TelegramLongPollingBot {
    private final Bot bot;

    @Override
    public void onUpdateReceived(Update update) {
        if (!update.hasMessage()) {
            return;
        }

        SendMessage message = new SendMessage()
                .setChatId(update.getMessage().getChatId())
//                .setText(messageHandler.handle(update.getMessage()))
                .setText("test")
                .setParseMode(ParseMode.MARKDOWN);

        sendMessage(message);
    }

    private void sendMessage(SendMessage message) {
        try {
            execute(message);
        } catch (TelegramApiException e) {
            log.error("Fail to send response message : {}", e.getMessage());
        }
    }

    @Override
    public String getBotUsername() {
        return bot.getName();
    }

    @Override
    public String getBotToken() {
        return bot.getToken();
    }

    @PostConstruct
    public void init() {
        log.info("Telegram Bot [{}] initialized with Token [{}]", bot.getName(), bot.getToken());
    }
}
