# Build the maven project
mvn clean install

# In order to run the FileWatcherObserverUsingApache class as main
java -cp target/file-monitor-1.0-SNAPSHOT.jar org.sjb.filemonitor.FileWatcherObserverUsingApache <directory_to_watch> > monitor.log 2>&1 &

# In order to run the FileWatcherServicei as main
## Use -r as an argument if you want to recursively watch all the sub-folders, else omit -r
java -cp target/file-monitor-1.0-SNAPSHOT.jar org.sjb.filemonitor.FileWatcherService -r <directory_to_watch> > monitor.log 2>&1 &
