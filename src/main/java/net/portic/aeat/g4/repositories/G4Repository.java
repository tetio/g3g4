package net.portic.aeat.g4.repositories;

import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aduanas.es.aeat.adds.jdit.g4.ws.g4decv1ent.G4DecV1Ent;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface G4Repository extends MongoRepository<G4DecV1Ent, String> {
}
