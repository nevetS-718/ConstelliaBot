package tech.nevets.constelliabot.commands.strings;

import tech.nevets.constelliabot.Bot;
import tech.nevets.constelliabot.commands.CommandContext;
import tech.nevets.constelliabot.commands.ICommand;

import java.util.List;
import java.util.Random;

public class JangoTheSovietCmd implements ICommand {

    @Override
    public void handle(CommandContext ctx) {
        Random r = new Random();
        int max = 2;

        int i = r.nextInt(max);
        if (i == 0) {
            ctx.getChannel().sendTyping().queue();
            ctx.getChannel().sendMessage("JOIN THE CSE!").queue();
        } else {
            ctx.getChannel().sendTyping().queue();
            ctx.getChannel().sendMessage("Praise be it thy Spruce").queue();
        }
    }

    @Override
    public String getName() {
        return "jangothesoviet";
    }

    @Override
    public String getHelp() {
        return "Sends a good morning message\n" +
                "Usage: `" + Bot.prefix + "jangothesoviet`";
    }

    @Override
    public List<String> getAliases() {
        return List.of("jango", "cse", "spruce");
    }
}
