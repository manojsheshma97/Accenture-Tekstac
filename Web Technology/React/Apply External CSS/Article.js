import React, { Component } from 'react';
import './Article.css'
    
    var data=[    
    		{"id":"RA100", "name":"Keyan Zhang", "title":"Introducing React's Error Code System", "date":"Mon Jul 1 2018"},    
    		{"id":"RA101", "name":"Dan Abramov", "title":"Mixin Considered Harmful", "date":"Wed Sep 21 2018"},
		{"id":"RA102", "name":"Scott Holds ", "title":"Create Higher Order Component", "date":"Fri Nov 20 2018"},
    		{"id":"RA103", "name":"Kurt Lee", "title":"React Best Practices", "date":"Tue Nov 10 2018"}
    	];  
    
    class Article extends Component 
    {
    	constructor()
    	{
    	    super()
    	    this.state = {articles: data}
   	}
   	
   	render()
   	{
    	    const haver = this.state.articles.map(infe=> <Display name={infe.name} key={infe.id} title={infe.title} date={infe.date}/>);
    	    
    	    return(
   	            <div>
    	                {haver}
    	            </div>
    	        )
    	}
    }
   
    class Display extends Component 
    {
   	render()
    	{
    	    return(
    	            <div className='article'>
  	                <p >{this.props.key}</p>
   	                <p >{this.props.name}</p>
   	                <p>{this.props.title}</p>
   	                <p >{this.props.date}</p>
    	            </div>
    	        )
    	}
    }
    
    export {Display}
    export default Article