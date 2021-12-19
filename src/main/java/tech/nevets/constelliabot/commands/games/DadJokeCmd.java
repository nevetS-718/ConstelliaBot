package tech.nevets.constelliabot.commands.games;

import tech.nevets.constelliabot.Bot;
import tech.nevets.constelliabot.commands.CommandContext;
import tech.nevets.constelliabot.commands.ICommand;
import tech.nevets.constelliabot.util.httpRequests.DadJoke;

import java.io.IOException;
import java.util.List;

public class DadJokeCmd implements ICommand {
    @Override
    public void handle(CommandContext ctx) {
        try { DadJoke.getHttpConnection(); } catch (IOException | InterruptedException e) { e.printStackTrace(); }

        ctx.getChannel().sendTyping().queue();
        ctx.getChannel().sendMessage(DadJoke.joke).queue();
    }

    @Override
    public String getName() {
        return "dadjoke";
    }

    @Override
    public String getHelp() {
        return "Sends a dad joke :P\n" +
                "Usage: `" + Bot.prefix + "dadjoke`";
    }

    @Override
    public List<String> getAliases() {
        return List.of("joke");
    }
}
