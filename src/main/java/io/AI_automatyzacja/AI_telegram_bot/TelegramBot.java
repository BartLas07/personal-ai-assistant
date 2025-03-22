package io.AI_automatyzacja.AI_telegram_bot;




import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class TelegramBot extends TelegramLongPollingBot {

    @Override
    public String getBotUsername() {
        return "umbai_bot";
    }

    @Override
    public String getBotToken() {
        return "7360917535:AAH61-Qi10akhh2FWS_mnB9ObCFu_rLqDLA";
    }

    @Override
    public void onUpdateReceived(Update update) {
        var msg = update.getMessage();
        var user = msg.getFrom();

        System.out.println(user.getFirstName() + " wrote " + msg.getText());
    }
}
