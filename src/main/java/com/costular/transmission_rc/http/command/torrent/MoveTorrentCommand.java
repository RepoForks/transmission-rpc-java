package com.costular.transmission_rc.http.command.torrent;

import com.costular.transmission_rc.http.command.BodyArguments;
import com.costular.transmission_rc.http.command.Command;

/**
 * Created by costular on 23/07/17.
 */
public class MoveTorrentCommand extends Command {

    public MoveTorrentCommand(BodyArguments arguments) {
        super("torrent-set-location", arguments);
    }
}
