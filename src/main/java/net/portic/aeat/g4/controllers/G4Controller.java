package net.portic.aeat.g4.controllers;

import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aduanas.es.aeat.adds.jdit.g4.ws.g4decv1ent.G4DecV1Ent;
import lombok.AllArgsConstructor;
import net.portic.aeat.g4.services.G4Service;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;

@Controller
@AllArgsConstructor
@RequestMapping("g4")
public class G4Controller {
    private final G4Service g4Service;
    @GetMapping(path = "/maker", produces = "application/json")
    public @ResponseBody G4DecV1Ent makeG4() {
        G4DecV1Ent g4 = g4Service.fromString(new File("src/test/resources/g4_dummy001.xml"));
        G4DecV1Ent updatedG4 = g4Service.save(g4);
        return updatedG4;
    }
}
