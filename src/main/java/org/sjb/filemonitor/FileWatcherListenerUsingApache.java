package org.sjb.filemonitor;

import java.io.File;

import org.apache.commons.io.monitor.FileAlterationListener;
import org.apache.commons.io.monitor.FileAlterationObserver;


public class FileWatcherListenerUsingApache implements FileAlterationListener {


    public void onDirectoryChange(File arg0) {
        System.out.println("Directory changed " + arg0.getAbsolutePath() );

    }


    public void onDirectoryCreate(File arg0) {
        System.out.println("Directory created " + arg0.getAbsolutePath() );

    }


    public void onDirectoryDelete(File arg0) {
        System.out.println("Directory deleted " + arg0.getAbsolutePath() );

    }


    public void onFileChange(File arg0) {
        System.out.println("File changed: " + arg0.getAbsolutePath() );

    }


    public void onFileCreate(File arg0) {
        System.out.println("File craeted " + arg0.getAbsolutePath() );

    }


    public void onFileDelete(File arg0) {
        System.out.println("File deleted " + arg0.getAbsolutePath() );

    }


    public void onStart(FileAlterationObserver arg0) {
        System.out.println("Observation started for " + arg0.getDirectory().getAbsolutePath() );

    }


    public void onStop(FileAlterationObserver arg0) {
        System.out.println("Observation stopped for " + arg0.getDirectory().getAbsolutePath() );

    }

}
