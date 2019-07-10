import React, { Component } from 'react';

class DropDown extends Component {
    constructor(props){
        super(props);
        this.state = {
          selected: props.selected
        }
        this.id = props.id;
        this.options = props.options;
        this.onChange = props.onChange;
        this.onChangeSelected = this.onChangeSelected.bind(this);
      }

    onChangeSelected(event){
        this.onChange(this.id, event.target.value);
    }
    componentWillReceiveProps(nextProps) {
      if(nextProps.selected !== this.props.selected){
        this.options = nextProps.options;
        const selected = nextProps.selected;
        this.setState({selected:selected});
      }
    }

    render () {
        return (
            <select value={this.state.selected.value} onChange={this.onChangeSelected}>
                {
                    this.options.map((option, optionIndex) => {
                      return (
                        <option value={option.value} key={optionIndex}>{option.label}</option>
                      )
                    })
                  }
                </select>
        )
    }
};

export default DropDown;