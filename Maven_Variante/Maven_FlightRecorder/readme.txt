FlightRecorder muss aktiviert werden, z.B. durch VM-Parameter beim Start:

-XX:StartFlightRecording=duration=200s,filename=flight.jfr

Alternativen: kann aktiviert werden via Kommandozeilen-Tool jcmd (im JDK enthalten)
oder aber über grafische Frontends wie VisualVM, ...

In Eclipse existiert eigene Perspektive: JDK Mission Control perspective



Auswertung des Recordings kann in Eclipse visualisiert werden:

flight.jfr  öffnen mit "Open With Flight Recording"


oder aber durch Kommandozeilen-Tools (jfr im Open JDK) oder aber oben genannte grafische Tools.


siehe z.B:
            https://www.baeldung.com/java-flight-recorder-monitoring
            https://developers.redhat.com/blog/2020/08/25/get-started-with-jdk-flight-recorder-in-openjdk-8u
            https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/Start-Java-Flight-Recorder-Eclipse-Profile-Monitor
            
            