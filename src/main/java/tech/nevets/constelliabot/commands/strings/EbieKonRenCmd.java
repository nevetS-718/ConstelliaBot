package tech.nevets.constelliabot.commands.strings;

import tech.nevets.constelliabot.Bot;
import tech.nevets.constelliabot.commands.CommandContext;
import tech.nevets.constelliabot.commands.ICommand;

import java.util.List;
import java.util.Random;

public class EbieKonRenCmd implements ICommand {

    @Override
    public void handle(CommandContext ctx) {
        Random r = new Random();
        int max = 2;

        int i = r.nextInt(max);
        if (i == 0) {
            ctx.getChannel().sendTyping().queue();
            ctx.getChannel().sendMessage("*proceeds to run every command the bot has*").queue();
            ctx.getChannel().sendMessage("-EbieKonRen").queue();
        } else {
            ctx.getChannel().sendTyping().queue();
            ctx.getChannel().sendMessage("Hmm I wonder what this command does?").queue();
            ctx.getChannel().sendMessage("-EbieKonRen").queue();
        }
    }

    @Override
    public String getName() {
        return "ebiekonren";
    }

    @Override
    public String getHelp() {
        return "Sends a good morning message\n" +
                "Usage: `" + Bot.prefix + "ebiekonren`";
    }

    @Override
    public List<String> getAliases() {
        return List.of("cmd", "ebie", "everycommand");
    }
}
