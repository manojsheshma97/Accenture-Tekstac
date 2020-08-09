import React, { Component } from 'react';
import axios from 'axios';

class Async extends Component {
    //IMPLEMENT YOUR CODE HERE. 
constructor(props) {
		//IMPLEMENT CODE HERE. Declare "articleList" as state variable
		super()
		this.state = {articleList: []}
        this.componentDidMount = this.componentDidMount.bind(this)
	}
	componentWillMount(){
		//IMPLEMENT ANY CODE REQUIRED
	}
	render()
   	{
           return(
                <div>
                {this.state.articleList.map(element => (
                     <p>{element.id} {element.title} {element.date}</p>))}
               </div>
   	        )
   	}
	async componentDidMount(){
		//IMPLEMENT CODE HERE
		try{
		await axios.get("articles.json").then(data => this.setState({ articleList: data.data}))
    }
    catch(e){}
}
}

export default Async;


	
    


