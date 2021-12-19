package tech.nevets.constelliabot.commands.games;

import tech.nevets.constelliabot.Bot;
import tech.nevets.constelliabot.commands.CommandContext;
import tech.nevets.constelliabot.commands.ICommand;

import java.util.List;
import java.util.Random;

public class CoinFlipCmd implements ICommand {
    @Override
    public void handle(CommandContext ctx) {
        Random r = new Random();
        int max = 2;

        int i = r.nextInt(max);
        if (i == 0) {
            ctx.getChannel().sendTyping().queue();
            ctx.getChannel().sendMessage("The coin landed on **heads**").queue();
        } else {
            ctx.getChannel().sendTyping().queue();
            ctx.getChannel().sendMessage("The coin landed on **tails**").queue();
        }
    }

    @Override
    public String getName() {
        return "coinflip";
    }

    @Override
    public String getHelp() {
        return "Returns a heads or tails value" +
                "Usage: `" + Bot.prefix + "coinflip`";
    }

    @Override
    public List<String> getAliases() {
        return List.of("coin", "flip");
    }
}
