package tech.nevets.constelliabot.commands.strings;

import tech.nevets.constelliabot.Bot;
import tech.nevets.constelliabot.commands.CommandContext;
import tech.nevets.constelliabot.commands.ICommand;

import java.util.List;
import java.util.Random;

public class BlueSpruceCmd implements ICommand {

    @Override
    public void handle(CommandContext ctx) {
        Random r = new Random();
        int max = 2;

        int i = r.nextInt(max);
        if (i == 0) {
            ctx.getChannel().sendTyping().queue();
            ctx.getChannel().sendMessage("Praise be it thy Spruce").queue();
        } else {
            ctx.getChannel().sendTyping().queue();
            ctx.getChannel().sendMessage("*sends another picture of a new Kumbucha brand that nobody has ever heard of before*").queue();
        }
    }

    @Override
    public String getName() {
        return "bluespruce";
    }

    @Override
    public String getHelp() {
        return "Sends a good morning message\n" +
                "Usage: `" + Bot.prefix + "bluespruce`";
    }

    @Override
    public List<String> getAliases() {
        return List.of("spruce", "blue");
    }
}
