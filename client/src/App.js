import React, { Fragment } from 'react';
import Header from './components/layout/Header';
import { Footer } from './components/layout/Footer';
import Dashboard from './components/pages/Dashboard';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';

import './App.css';
import SideMenu from './components/layout/SideMenu';
import Register from './components/auth/Register';
import { Provider } from 'react-redux';
import store from './store';

const App = () => {
  return (
    <Provider store={store}>
      <Router>
        <Fragment className='wrapper'>
          <Header />

          <Switch>
            <Route exact path='/' component={Dashboard}></Route>
            <Route exact path='/register' component={Register}></Route>
          </Switch>

          <Footer />
        </Fragment>
      </Router>
    </Provider>
  );
};

export default App;
