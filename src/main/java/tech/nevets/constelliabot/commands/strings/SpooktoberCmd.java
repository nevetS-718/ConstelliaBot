package tech.nevets.constelliabot.commands.strings;

import tech.nevets.constelliabot.Bot;
import tech.nevets.constelliabot.commands.CommandContext;
import tech.nevets.constelliabot.commands.ICommand;

import java.util.List;

public class SpooktoberCmd implements ICommand {
    @Override
    public void handle(CommandContext ctx) {
        ctx.getChannel().sendTyping().queue();
        ctx.getChannel().sendMessage("Happy Spooktober!").queue();
    }

    @Override
    public String getName() {
        return "spooktober";
    }

    @Override
    public String getHelp() {
        return "Sends a good morning message\n" +
                "Usage: `" + Bot.prefix + "spooktober`";
    }

    @Override
    public List<String> getAliases() {
        return List.of("spook", "spooky", "october");
    }
}
