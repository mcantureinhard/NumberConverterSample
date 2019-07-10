import React, { Component } from 'react';
import DropDown from '../DropDown/DropDown';

class Converter extends Component {
  constructor(props){
    super(props);
    this.options = props.options;
    //not very nice
    if(this.options == undefined || this.options[0] == undefined){
      var selected = '';
      this.options = [];
    } else{
      var selected = this.options[0].value;
    }
    this.state = {
      title: props.title,
      from: selected,
      to: selected,
      input: '',
      result: ''
    }
    this.onSubmit = props.onSubmit;
    this.clearResult = this.clearResult.bind(this);
    this.resultCallback = this.resultCallback.bind(this);
    this.onInputChange = this.onInputChange.bind(this);
    this.onElementChange = this.onElementChange.bind(this);
  }
  clearResult(){
    this.setState({result:''});
  }

  onInputChange(event){
    this.clearResult();
    this.setState({ [event.target.name]: event.target.value });
  }

  onElementChange(id, value) {
    var stateObj = {}
    stateObj[id] = value;
    this.clearResult();
    this.setState(stateObj);
  }
  resultCallback(res){
    this.setState({result:res});
  }
  componentWillReceiveProps(nextProps) {
    if(nextProps.options !== this.props.options){
      this.options = nextProps.options;
      //also not nice
      var selected = this.options[0].value;
      var obj = {
        from: selected,
        to: selected
      }
      this.setState(obj);
    }
  }

  
  render () {
    return (
      <div>
        <div>
          <h1>{this.state.title}</h1>
              <input className="input" name="input" value={this.state.input} onChange={this.onInputChange} />
              <DropDown options={this.options} selected={this.state.from} onChange={this.onElementChange} id="from"/>
              <label className="label"> in </label>
              <DropDown options={this.options} selected={this.state.to} onChange={this.onElementChange} id="to"/>
              <label className="label"> is </label>
              <label className="label">{this.state.result}</label>
        </div>
        <button onClick={() => this.onSubmit(this.state, this.resultCallback)}>Calculate</button>
      </div>
    );
  }
}

export default Converter;