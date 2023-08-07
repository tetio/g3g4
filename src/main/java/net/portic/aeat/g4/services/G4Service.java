package net.portic.aeat.g4.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aduanas.es.aeat.adds.jdit.g4.ws.g4decv1ent.G4DecV1Ent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.portic.aeat.g4.repositories.G4Repository;
import org.springframework.stereotype.Service;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

@Slf4j
@RequiredArgsConstructor
@Service
public class G4Service {
    private final G4Repository g4Repository;
    public G4DecV1Ent fromString(File xmlFile) {
        G4DecV1Ent g4Ent = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(G4DecV1Ent.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            g4Ent = (G4DecV1Ent) jaxbUnmarshaller.unmarshal(xmlFile);
        } catch (JAXBException e) {
            log.error("Could not read the file and instantiate a g4 document");
        }
        return g4Ent;
    }

    public String toJsonString(G4DecV1Ent g4Ent) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, true);
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        // StdDateFormat is ISO8601 since jackson 2.9
        mapper.setDateFormat(new StdDateFormat().withColonInTimeZone(true));
        String json = mapper.writeValueAsString(g4Ent);
        return json;
    }

    public G4DecV1Ent save(G4DecV1Ent g4) {
        return g4Repository.save(g4);
    }
}
