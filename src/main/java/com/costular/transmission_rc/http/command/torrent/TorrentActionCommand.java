package com.costular.transmission_rc.http.command.torrent;

import com.costular.transmission_rc.api.domain.TorrentAction;
import com.costular.transmission_rc.api.domain.TorrentActionArguments;
import com.costular.transmission_rc.api.domain.ids.Ids;
import com.costular.transmission_rc.http.command.BodyArguments;
import com.costular.transmission_rc.http.command.Command;

/**
 * Created by costular on 22/07/17.
 */
public class TorrentActionCommand extends Command {

    public static TorrentActionCommand create(TorrentAction torrentAction, Ids ids) {
        return new TorrentActionCommand(torrentAction.getType(), new TorrentActionArguments(ids));
    }

    public TorrentActionCommand(String method, BodyArguments arguments) {
        super(method, arguments);
    }
}
