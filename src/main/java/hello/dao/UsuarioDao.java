package hello.dao;

import hello.model.Usuario;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by DU on 13/04/2017.
 */
public interface UsuarioDao {

    /**
     * Esse método retorna uma lista de usuarios de um banco de dados levando em consideração
     * os parâmetros de ordenação, filtros e limitação do resultado
     *
     * @param sorted Se o resultado deve ser ordenado ou não
     * @param sortField Qual campo deve ser utilizado para a ordenação
     * @param sortOrder Qual deve ser a forma de ordenação (ascendente ou descendente)
     * @param filterFields Uma lista com os campos de filtragem
     * @param filterValues Uma lista com os valores de filtragem
     * @param from Indice do primeiro registro
     * @param to Indice do ultimo registro
     * @return uma lista de usuarios
     */
    List<Usuario> findAll(boolean sorted, String sortField, String sortOrder, List<String> filterFields, List<String> filterValues, int from, int to);

    /**
     * Esse método retorna uma lista de usuarios  de um banco de dados levando em consideração
     * os parâmetros de ordenação, filtros e limitação do resultado
     *
     * @param filterFields Uma lista com os campos de filtragem
     * @param filterValues Uma lista com os valores de filtragem
     * @return números de usuarios que satisfazem os parametros
     */
    Long total(List<String> filterFields, List<String> filterValues);
}
