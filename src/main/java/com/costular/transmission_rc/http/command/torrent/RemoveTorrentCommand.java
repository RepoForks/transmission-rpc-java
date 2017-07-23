package com.costular.transmission_rc.http.command.torrent;

import com.costular.transmission_rc.http.command.BodyArguments;
import com.costular.transmission_rc.http.command.Command;

/**
 * Created by costular on 22/07/17.
 */
public class RemoveTorrentCommand extends Command {

    public RemoveTorrentCommand(BodyArguments arguments) {
        super("torrent-remove", arguments);
    }
}
