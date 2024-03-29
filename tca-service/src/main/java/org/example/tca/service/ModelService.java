package org.example.tca.service;

import org.example.tca.exception.ModelException;
import org.example.tca.vo.ModelVO;

import java.util.List;

public interface ModelService {

    void importModel(String json, String fileName) throws Exception;

    List<ModelVO> getModels();

    ModelVO getModel(String name, String family);

    void updateModel(String name, String family, ModelVO modelVO) throws ModelException;

    void deleteModel(String name, String family) throws ModelException;

    void deleteAllModel() throws ModelException;
}
