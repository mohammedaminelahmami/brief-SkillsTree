import { Dialog, Transition } from '@headlessui/react'
import axios from 'axios';
import { Fragment } from 'react'
import ActivityIndicator from 'react-activity-indicator'
import { useQuery } from 'react-query';
import Dropdown from '../components/Dropdown'

export default function Modal({stateModal, onClose, apprenant}) {

  const getAllReferenciels = async ()=>{
    let response = await axios.get(`http://localhost:8080/api/referenciel/getAllReferenciels`);
    return response.data;
  }

  const {data, status} = useQuery("getAllReferenciels", getAllReferenciels);

  if(status === "loading")
  {
    return(
      <div className="centerAbsoluteDiv">
        <ActivityIndicator
          number={5}
          diameter={40}
          borderWidth={1}
          duration={300}
          activeColor="#1d4ed8"
          borderColor="white"
          borderRadius="50%"
        />
      </div>
      )
  }

  if(status === "error")
  {
    return <h1>Error...</h1>
  }
  return (
    <>
      <Transition appear show={stateModal} as={Fragment}>
        <Dialog as="div" className="relative z-10" onClose={onClose}>
          <Transition.Child
            as={Fragment}
            enter="ease-out duration-300"
            enterFrom="opacity-0"
            enterTo="opacity-100"
            leave="ease-in duration-200"
            leaveFrom="opacity-100"
            leaveTo="opacity-0"
          >
            <div className="fixed inset-0 bg-black bg-opacity-25" />
          </Transition.Child>

          <div className="fixed inset-0 overflow-y-auto">
            <div className="flex min-h-full items-center justify-center p-4 text-center">
              <Transition.Child
                as={Fragment}
                enter="ease-out duration-300"
                enterFrom="opacity-0 scale-95"
                enterTo="opacity-100 scale-100"
                leave="ease-in duration-200"
                leaveFrom="opacity-100 scale-100"
                leaveTo="opacity-0 scale-95"
              >
                <Dialog.Panel className="w-full max-w-md transform overflow-hidden rounded-2xl bg-white p-6 text-left align-middle shadow-xl transition-all">
                  <Dialog.Title
                    as="h3"
                    className="text-lg font-medium leading-6 text-gray-900"
                  >
                    {apprenant.prenom + " " + apprenant.nom}
                  </Dialog.Title>
                  <div className="m-4">
                    <Dropdown refs={data} />
                  </div>
                </Dialog.Panel>
              </Transition.Child>
            </div>
          </div>
        </Dialog>
      </Transition>
    </>
  )
}
