package tech.nevets.constelliabot.commands.strings;

import tech.nevets.constelliabot.Bot;
import tech.nevets.constelliabot.commands.CommandContext;
import tech.nevets.constelliabot.commands.ICommand;

import java.util.List;

public class GoodMorningCmd implements ICommand {

    @Override
    public void handle(CommandContext ctx) {
        ctx.getChannel().sendTyping().queue();
        ctx.getChannel().sendMessage("Good morning Costco!").queue();
    }

    @Override
    public String getName() {
        return "goodmorning";
    }

    @Override
    public String getHelp() {
        return "Sends a good morning message\n" +
                "Usage: `" + Bot.prefix + "goodmorning`";
    }

    @Override
    public List<String> getAliases() {
        return List.of("morning", "gm", "costco");
    }
}
