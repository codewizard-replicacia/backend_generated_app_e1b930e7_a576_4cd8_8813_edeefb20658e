package com.mycompany.group234.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.mycompany.group234.model.BuildTool;
import com.mycompany.group234.model.UIComp;
import com.mycompany.group234.model.Document;
import com.mycompany.group234.model.FrontendApp;
import com.mycompany.group234.model.Architecture;
import com.mycompany.group234.model.UITemplate;
import com.mycompany.group234.model.Server;
import com.mycompany.group234.model.PackageManagement;
import com.mycompany.group234.model.TemplateScreen;
import com.mycompany.group234.model.UIField;
import com.mycompany.group234.model.FrontendScreen;
import com.mycompany.group234.model.complex.BasicDetails;
import com.mycompany.group234.model.complex.AdvancedDetails;
import com.mycompany.group234.converter.DurationConverter;
import com.mycompany.group234.converter.UUIDToByteConverter;
import com.mycompany.group234.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "TemplateScreen")
@Table(name = "\"TemplateScreen\"", schema =  "\"generated_app\"")
@Data
                        
public class TemplateScreen {
	public TemplateScreen () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"TeScreenId\"", nullable = true )
  private Integer teScreenId;
	  
  @Column(name = "\"ScreenName\"", nullable = true )
  private String screenName;
  
	  
  @Column(name = "\"ScreenDescription\"", nullable = true )
  private String screenDescription;
  
	  
  @Column(name = "\"Documentation\"", nullable = true )
  private String documentation;
  
	  
  @Column(name = "\"ScreenLayout\"", nullable = true )
  private String screenLayout;
  
	  
  @Column(name = "\"ScreenURL\"", nullable = true )
  private String screenURL;
  
	  
  @Column(name = "\"ScreenFilePath\"", nullable = true )
  private String screenFilePath;
  
  
  
  
		@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "\"TemplateScreenTempDocument\"", referencedColumnName = "\"DocId\"", insertable = false, updatable = false)
	private Document tempDocument;
	
	@Column(name = "\"TemplateScreenTempDocument\"")
	private Long templateScreenTempDocument;
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "TemplateScreen [" 
  + "TeScreenId= " + teScreenId  + ", " 
  + "ScreenName= " + screenName  + ", " 
  + "ScreenDescription= " + screenDescription  + ", " 
  + "Documentation= " + documentation  + ", " 
  + "ScreenLayout= " + screenLayout  + ", " 
  + "ScreenURL= " + screenURL  + ", " 
  + "ScreenFilePath= " + screenFilePath 
 + "]";
	}
	
}