/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.ptl.sc.model;

import java.util.Date;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

/**
 *
 * @author Florent
 * Un commentaire est attaché à une issues.
 */
class Comment {
    
    @Id
	private String id;
	
	@DBRef
        private User author;
         
	private Date date;
	private String content;

        
	
}
