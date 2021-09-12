package tech.nevets.constelliabot.commands.pictures;

import net.dv8tion.jda.api.EmbedBuilder;
import tech.nevets.constelliabot.Bot;
import tech.nevets.constelliabot.commands.CommandContext;
import tech.nevets.constelliabot.commands.ICommand;
import tech.nevets.constelliabot.util.httpRequests.temp.PandaRequest;

import java.io.IOException;

public class PandaCmd implements ICommand {
    @Override
    public void handle(CommandContext ctx) {
        try { PandaRequest.getHttpConnection(); } catch (IOException | InterruptedException e) { e.printStackTrace(); }
        EmbedBuilder eb = new EmbedBuilder();

        ctx.getChannel().sendTyping().queue();
        eb.setImage(PandaRequest.url);
        ctx.getChannel().sendMessageEmbeds(eb.build()).queue();
    }

    @Override
    public String getName() {
        return "panda";
    }

    @Override
    public String getHelp() {
        return "Sends a picture of a panda!\n" +
                "Usage: `" + Bot.prefix + "panda`";
    }
}
