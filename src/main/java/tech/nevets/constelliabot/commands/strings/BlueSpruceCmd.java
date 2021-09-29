package tech.nevets.constelliabot.commands.strings;

import tech.nevets.constelliabot.Bot;
import tech.nevets.constelliabot.commands.CommandContext;
import tech.nevets.constelliabot.commands.ICommand;

import java.util.List;
import java.util.Random;

public class BlueSpruceCmd implements ICommand {

    @Override
    public void handle(CommandContext ctx) {
        ctx.getChannel().sendTyping().queue();
        ctx.getChannel().sendMessage("Praise be it thy Spruce").queue();
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
