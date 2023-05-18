import React, { Component } from 'react';

class HeaderComponent extends Component {
    constructor(props){
        super(props)
        this.state = {

        }
    }

    render() {
        return (
            <div>
                <header>
                <nav className="navbar navbar-expand-sm bg-secondary navbar-light">
                <div><a className="navbar-brand">Teacher Management App</a></div>
                </nav>
                </header>
            </div>
        );
    }
}

export default HeaderComponent;