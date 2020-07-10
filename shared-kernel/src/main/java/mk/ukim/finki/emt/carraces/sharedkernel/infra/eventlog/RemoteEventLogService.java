package mk.ukim.finki.emt.carraces.sharedkernel.infra.eventlog;

import mk.ukim.finki.emt.carraces.sharedkernel.domain.base.RemoteEventLog;

public interface RemoteEventLogService {

    String source();

    RemoteEventLog currentLog(long lastProcessedId);

}
