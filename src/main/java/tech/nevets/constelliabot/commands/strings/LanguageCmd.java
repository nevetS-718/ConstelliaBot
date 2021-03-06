package tech.nevets.constelliabot.commands.strings;

import net.dv8tion.jda.api.entities.TextChannel;
import tech.nevets.constelliabot.Config;
import tech.nevets.constelliabot.commands.CommandContext;
import tech.nevets.constelliabot.commands.ICommand;

import java.util.List;

public class LanguageCmd implements ICommand {
    @Override
    public void handle(CommandContext ctx) {
        List<String> args = ctx.getArgs();
        TextChannel channel = ctx.getChannel();

        if (args.isEmpty()) {
            channel.sendTyping().queue();
            channel.sendMessage("Watch your **fucking** language!").queue();
        }
    }

    @Override
    public String getName() {
        return "language";
    }

    @Override
    public String getHelp() {
        String prefix = Config.getConfig().getString("bot.prefix");
        return "Warns people for using foul language\n" +
                "Usage: `" + prefix + "language`";
    }

    @Override
    public List<String> getAliases() {
        return List.of("bluewing");
    }
}