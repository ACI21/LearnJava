/**
 * 
 */
package com.sge.project1.controller;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * 
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class EmpleadoControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
    public void testGetAllEmpleados() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/empleados"))
               .andExpect(MockMvcResultMatchers.status().isOk())
               // Agregar más validaciones según la respuesta esperada
               .andReturn();
    }
	
	@Test
    public void testCrearEmpleado() throws Exception {
        String empleadoJSON = "{ \"nombre\": \"Nuevo Empleado\", \"salario\": 50000.0 }";
        mockMvc.perform(MockMvcRequestBuilders.post("/empleados")
               .contentType(MediaType.APPLICATION_JSON)
               .content(empleadoJSON))
               .andExpect(MockMvcResultMatchers.status().isOk())
               // Agregar más validaciones según la respuesta esperada
               .andReturn();
    }

    @Test
    public void testActualizarEmpleado() throws Exception {
        String empleadoJSON = "{ \"nombre\": \"Empleado Actualizado\", \"salario\": 60000.0 }";
        mockMvc.perform(MockMvcRequestBuilders.put("/empleados/{id}", 1)
               .contentType(MediaType.APPLICATION_JSON)
               .content(empleadoJSON))
               .andExpect(MockMvcResultMatchers.status().isOk())
               // Agregar más validaciones según la respuesta esperada
               .andReturn();
    }

    @Test
    public void testEliminarEmpleado() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.delete("/empleados/{id}", 1))
               .andExpect(MockMvcResultMatchers.status().isNoContent())
               .andReturn();
    }
}
