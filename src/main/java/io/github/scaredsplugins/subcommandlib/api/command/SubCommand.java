package io.github.scaredsplugins.subcommandlib.api.command;

import org.bukkit.entity.Player;

import java.util.List;

public abstract class SubCommand {

    //Name of the subcommand ex. /prank <subcommand> <-- that
    public abstract String getName();

    //Here you enter the description that shows up on /help"
    public abstract String getDescription();

    //How to use command ex. /prank freeze <player>
    public abstract String getSyntax();

    //code for the subcommand
    public abstract void perform(Player player, String[] args);

    public abstract List<String> getSubcommandArguments(Player player, String[] args);

}

