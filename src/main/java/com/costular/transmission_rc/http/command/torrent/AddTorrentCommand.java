package com.costular.transmission_rc.http.command.torrent;

import com.costular.transmission_rc.api.domain.AddTorrentArguments;
import com.costular.transmission_rc.http.command.Command;

/**
 * Created by costular on 20/07/17.
 */
public class AddTorrentCommand extends Command {

    public AddTorrentCommand(AddTorrentArguments arguments) {
        super("torrent-add", arguments);
    }
}
