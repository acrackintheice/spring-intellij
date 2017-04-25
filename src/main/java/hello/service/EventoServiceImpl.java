package hello.service;

import hello.dao.EventoDao;
import hello.model.Evento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by DU on 17/04/2017.
 */

@Service("eventoService")
@Transactional
public class EventoServiceImpl implements EventoService {

    @Autowired
    EventoDao dao;


    @Override
    public List<Evento> findAll() {
        return dao.findAll();
    }

}
