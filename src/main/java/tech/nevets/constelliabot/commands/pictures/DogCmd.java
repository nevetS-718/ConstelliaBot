package tech.nevets.constelliabot.commands.pictures;

import net.dv8tion.jda.api.EmbedBuilder;
import tech.nevets.constelliabot.Bot;
import tech.nevets.constelliabot.commands.CommandContext;
import tech.nevets.constelliabot.commands.ICommand;
import tech.nevets.constelliabot.util.httpRequests.temp.DogRequest;

import java.io.IOException;

public class DogCmd implements ICommand {
    @Override
    public void handle(CommandContext ctx) {
        try { DogRequest.getHttpConnection(); } catch (IOException | InterruptedException e) { e.printStackTrace(); }
        EmbedBuilder eb = new EmbedBuilder();

        ctx.getChannel().sendTyping().queue();
        eb.setImage(DogRequest.url);
        ctx.getChannel().sendMessage(eb.build()).queue();
    }

    @Override
    public String getName() {
        return "dog";
    }

    @Override
    public String getHelp() {
        return "Sends a picture of a dog!\n" +
                "Usage: `" + Bot.prefix + "dog`";
    }
}
