package org.sjb.filemonitor;

import org.apache.commons.io.monitor.FileAlterationMonitor;
import org.apache.commons.io.monitor.FileAlterationObserver;

import java.io.File;

public class FileWatcherObserverUsingApache {
    public static void main(String[] args) throws Exception {

        //create file to watch on
        File dirToWatch = new File(args[0]);

        // create alteration observer on file
        FileAlterationObserver observer = new FileAlterationObserver(dirToWatch);

        // register listener with observer
        observer.addListener(new FileWatcherListenerUsingApache());

        // create Monitor ( Thread )
        final FileAlterationMonitor monitor = new FileAlterationMonitor();

        // Register Observer with Monitor
        monitor.addObserver(observer);


        // Start thread to observe on /temp
        System.out.println("Observation started on :" + dirToWatch.getAbsolutePath());
        monitor.start();

        //
        System.out.println("PRESS CNTL+C to stop");

        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                try {
                    monitor.stop();
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

    }
}
