/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ist.processpedia.dto;

/**
 *
 * @author davidmartinho
 */
public class QueueDto {

    public String id;
    public String name;

    public QueueDto(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
