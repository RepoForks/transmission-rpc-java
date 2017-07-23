package com.costular.transmission_rc.http.command.torrent;

import com.costular.transmission_rc.api.domain.QueueAction;
import com.costular.transmission_rc.api.domain.QueueMovementArguments;
import com.costular.transmission_rc.api.domain.TorrentAction;
import com.costular.transmission_rc.api.domain.TorrentActionArguments;
import com.costular.transmission_rc.api.domain.ids.Ids;
import com.costular.transmission_rc.http.command.BodyArguments;
import com.costular.transmission_rc.http.command.Command;

/**
 * Created by costular on 23/07/17.
 */
public class QueueMovementCommand extends Command {

    public static QueueMovementCommand create(QueueAction queueAction, Ids ids) {
        return new QueueMovementCommand(queueAction.getType(), new QueueMovementArguments(ids));
    }

    public QueueMovementCommand(String method, BodyArguments arguments) {
        super(method, arguments);
    }
}
