package com.devsuperior.crud.dto;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends CustomError{

    private List<FieldMessage> erros = new ArrayList<>();
}
