package tech.nevets.constelliabot.commands.debug;

import net.dv8tion.jda.api.JDA;
import tech.nevets.constelliabot.Bot;
import tech.nevets.constelliabot.commands.CommandContext;
import tech.nevets.constelliabot.commands.ICommand;

public class PingCmd implements ICommand {
    @Override
    public void handle(CommandContext ctx) {
        JDA jda = ctx.getJDA();

        jda.getRestPing().queue((ping) -> ctx.getChannel().sendMessageFormat("Rest API Ping: %sms\nWebSocket Ping: %sms", ping, jda.getGatewayPing()).queue());

    }

    @Override
    public String getHelp() {
        return "Shows the current ping from the bot to the Discord servers" +
                "Usage: `" + Bot.prefix + "ping`";
    }

    @Override
    public String getName() {
        return "ping";
    }
}
