#
# Copyright (C) 2019 Wind River Systems, Inc.
#
#  Licensed under the Apache License, Version 2.0 (the "License");
#  you may not use this file except in compliance with the License.
#  You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
#  Unless required by applicable law or agreed to in writing, software
#  distributed under the License is distributed on an "AS IS" BASIS,
#  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
#  See the License for the specific language governing permissions and
#  limitations under the License.

SUMMARY = " StarlingX Single Server"

LICENSE = "MIT"

IMAGE_INSTALL_append = " \
	${CORE_IMAGE_BASE_INSTALL} \
	packagegroup-core-full-cmdline \
	packagegroup-core-security \
	packagegroup-core-selinux \
	packagegroup-cloud-compute \
	packagegroup-cloud-controller \
	packagegroup-cloud-network \
	packagegroup-cloud-debug \
	packagegroup-cloud-extras \
	packagegroup-stx \
	packagegroup-stak-python \
	packagegroup-stak-base \
	packagegroup-stak-ruby \
	packagegroup-stak-puppet \
	packagegroup-tpm2 \
	"
IMAGE_FEATURES += " \
	package-management \
	ssh-server-openssh \
	"

inherit core-image
inherit openstack-base
inherit identity
inherit monitor

# check for 5G of free space, so we use 5G as a starting point.
# IMAGE_ROOTFS_EXTRA_SPACE_append += "+ 5000000"
# POST_KEYSTONE_SETUP_COMMAND = "/etc/keystone/hybrid-backend-setup"
