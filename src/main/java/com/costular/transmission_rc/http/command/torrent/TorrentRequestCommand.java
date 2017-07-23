package com.costular.transmission_rc.http.command.torrent;

import com.costular.transmission_rc.api.domain.TorrentAction;
import com.costular.transmission_rc.api.domain.TorrentActionArguments;
import com.costular.transmission_rc.api.domain.ids.Ids;
import com.costular.transmission_rc.http.command.Command;
import com.costular.transmission_rc.http.command.BodyArguments;

/**
 * Created by costular on 20/07/17.
 */
public class TorrentRequestCommand extends Command {

    public static TorrentRequestCommand generate(TorrentAction torrentAction, Ids ids) {
        return new TorrentRequestCommand(torrentAction, new TorrentActionArguments(ids));
    }

    public TorrentRequestCommand(TorrentAction torrentAction, BodyArguments arguments) {
        super(torrentAction.getType(), arguments);
    }
}
