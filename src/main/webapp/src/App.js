import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import Converter from './components/Converter/Converter'
import { number_converter_options } from './api/NumberConverter';
import { convert_number } from './api/NumberConverter';


class App extends Component {
  constructor(props){
    super(props);
    this.click = this.click.bind(this);
    this.state = {
      options: []
    }
  }
  async click(state, cb){
    var result = await convert_number(state.from, state.to, state.input);
    if(result.status == 200){
      cb(result.data);
    } else {
      cb("ERROR");
    }
  }
  async componentDidMount() {
    let options_data = await number_converter_options();
    const options = options_data.data.map((elem) => {
        return {value:elem, label:elem};
    });
    this.setState({options});
  }
  render() {
    return (
      <div className="App">
      <Converter title="HELLO CONVERTER" onSubmit={this.click} options={this.state.options} />
    </div>
    )
  }
}

export default App;
