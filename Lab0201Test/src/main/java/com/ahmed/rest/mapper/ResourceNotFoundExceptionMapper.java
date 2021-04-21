package com.ahmed.rest.mapper;


import com.ahmed.rest.exception.ResourceNotFoundException;
import com.ahmed.rest.model.ErrorMessage;

import jakarta.ws.rs.core.*;
import jakarta.ws.rs.ext.*;

@Provider
public class ResourceNotFoundExceptionMapper implements ExceptionMapper<ResourceNotFoundException> {
    @Override
    public Response toResponse (ResourceNotFoundException e) {
    ErrorMessage errorMessage = new ErrorMessage(e.getMessage(), 404 , "probably wrong ID");
    return Response.status(Response.Status.NOT_FOUND).entity(errorMessage).build();
}
}
